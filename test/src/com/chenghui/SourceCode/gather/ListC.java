package com.chenghui.SourceCode.gather;

import com.sun.istack.internal.NotNull;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * 复制的List接口
 * @param <E>
 */
public interface ListC<E> {
    /**
     * 集合中数据元素个数
     * @return
     */
    int size();

    /**
     * 判断集合中是否含有元素，若有:返回true ,无:返回false
     * @return
     */
    boolean isEmpty();

    /**
     * 判断集合中是否含有目标元素
     * @param o
     * @return
     */
    boolean contains(Object o);

    /**
     * 获得此列表中元素的迭代器。
     * @return
     */
    @NotNull Iterator<E> iterator();

    /**
     *list转数组
     * @return
     */
    @NotNull Object[] toArray();

    @NotNull<T> T[] toArray(@NotNull T[] a);

    /**
     * 添加元素
     * @param e
     * @return
     */
    boolean add(E e);

    /**
     * 删除元素
     * @param o
     * @return
     */
    boolean remove(Object o);

    /**
     * 目标集合中得元素是否存在集合中
     * @param c
     * @return
     */
    boolean containsAll(@NotNull Collection<?> c);

    /**
     * 将参数集合中的元素全部添加到this集合中
     * @param c
     * @return
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * 指定固定索引处添加所有的集合元素
     * @param index
     * @param c
     * @return
     */
    boolean addAll(int index,Collection<? extends  E> c);

    /**
     * 移除集合参数中含有的所有元素
     * @param c
     * @return
     */
    boolean removeAll(Collection<?> c);

    /**
     *判断集合中是否含有该元素
     * @param c
     * @return
     */
    boolean retainAll(Collection<?> c);

    /**
     * 通过operator运算，将list集合中所有的元素将经过operator运算后的结果替代原来的结果
     * @param operator
     */
    default void replaceAll(UnaryOperator<E> operator){
        Objects.requireNonNull(operator);
        final ListIterator<E> li = this.listIterator();
        while(li.hasNext()){
            li.set(operator.apply(li.next()));
        }

    }

    /**
     * 排序
     * @param c
     */
    default void sort(Comparator<? super E> c){
        Object[] a = this.toArray();
        Arrays.sort(a,(Comparator)c);
        ListIterator<E> i = this.listIterator();
        for(Object e:a){
            i.next();
            i.set((E)e);
        }
    }

    /**
     * 清空
     */
    void clear();

    /**
     * 比较是否相等
     * @param o
     * @return
     */
    @Override
    boolean equals(Object o);

    /**
     * 计算hashCode值
     * @return
     */
    @Override
    int hashCode();

    /**
     * 查找对象o在集合中的索引
     * @param o
     * @return
     */
    int indexOf(Object o);

    /**
     * 元素o最后一个索引的位置
     * @param o
     * @return
     */
    int lastIndexOf(Object o);

    /**
     * 获取集合的迭代器对象
     * @return
     */
    ListIterator<E> listIterator();

    /**
     *
     * @param index
     * @return
     */
    ListIterator<E> listIterator(int index);

    /**
     * 集合的截取 从fromdex到toIndex
     * @param fromIndex
     * @param toIndex
     * @return
     */
    List<E> subList(int fromIndex,int toIndex);
}

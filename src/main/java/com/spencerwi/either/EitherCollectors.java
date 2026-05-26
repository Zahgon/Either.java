package com.spencerwi.either;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * These collectors collect a stream of Either<L,R> objects to an Either<List<L>, List<R>> object.
 *
 * @param <L> the "left side" type.
 * @param <R> the "right side type.
 */
public class EitherCollectors<L, R> implements Collector<Either<L, R>, EitherCollectors.EitherAccumulator<L, R>, Either<List<L>, List<R>>> {

    private final boolean leftBiased;

    /**
     * Factory method for creating a left biased collector which produces an Either<List<L>, List<R>> object,
     * where the list contains all the left or right Either values of the stream.
     * Since this is a left biased collector, the resulting Either is left iff the stream is empty or contains
     * at least one left Either object.
     * @return Either<List<L>, List<R>>
     */
    public static <L, R> Collector<Either<L, R>, ?, Either<List<L>, List<R>>> toLeftBiased() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Factory method for creating a right biased collector which produces an Either<List<L>, List<R>> object,
     * where the list contains all the left or right Either values of the stream.
     * Since this is a right biased collector, the resulting Either is right iff the stream is empty or contains
     * at least one right Either object.
     * @return Either<List<L>, List<R>>
     */
    public static <L, R> Collector<Either<L, R>, ?, Either<List<L>, List<R>>> toRightBiased() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private EitherCollectors(boolean leftBiased) {
        this.leftBiased = leftBiased;
    }

    @Override
    public Supplier<EitherAccumulator<L, R>> supplier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BiConsumer<EitherAccumulator<L, R>, Either<L, R>> accumulator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BinaryOperator<EitherAccumulator<L, R>> combiner() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Function<EitherAccumulator<L, R>, Either<List<L>, List<R>>> finisher() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Set<Characteristics> characteristics() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static class EitherAccumulator<L, R> {

        private final List<L> lefts;

        private final List<R> rights;

        private final boolean leftBiased;

        EitherAccumulator(boolean leftBiased) {
            this.leftBiased = leftBiased;
            this.lefts = new ArrayList<>();
            this.rights = new ArrayList<>();
        }

        void add(Either<L, R> e) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        EitherAccumulator<L, R> append(EitherAccumulator<L, R> accumulator2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        Either<List<L>, List<R>> finisher() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}

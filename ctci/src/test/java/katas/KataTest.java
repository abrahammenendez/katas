package katas;

import java.util.concurrent.*;

public class KataTest<T> {

  public T measure(Callable<T> function) {
    ExecutorService pool = Executors.newSingleThreadExecutor();
    T result = null;

    long startTime = System.nanoTime();

    try {
      Future<T> future = pool.submit(function);
      result = future.get();
    } catch (Exception e) {
      e.printStackTrace();
    }

    long endTime = System.nanoTime();

    long durationInNano = (endTime - startTime);

    long durationInMillis =
        TimeUnit.NANOSECONDS.toMillis(durationInNano); // Total execution time in nano seconds

    System.out.println("-- Time to execute --");
    System.out.println("Nanos: " + durationInNano);
    System.out.println("Millis: " + durationInMillis);

    return result;
  }
}

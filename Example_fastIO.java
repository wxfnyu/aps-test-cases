import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    // adjust the bufferSize to bigger number for faster speed ;)
    InputReader in = new InputReader(System.in, 1 << 14);
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream, int bufferSize) {
      reader = new BufferedReader(new InputStreamReader(stream), bufferSize);
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() { return Integer.parseInt(next()); }

    public long nextLong() { return Long.parseLong(next()); }

    public double nextDouble() { return Double.parseDouble(next()); }
  }
}
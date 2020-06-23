
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.*;

import io.vavr.control.Try;

public class Utf8ToLatinSerializer {

    public static String utf8ToLatin(String s) {

        return Try.ofSupplier(() -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c:s.toCharArray()) {

                boolean matches = String.valueOf(c).matches("[^a-zA-Z0-9]");

                if (matches) {
                    stringBuilder.append(Character.toLowerCase(c));
                } else {
                    stringBuilder.append(c);
                }
            }

            String stringFinal = stringBuilder.toString();

            Charset iso88591 = StandardCharsets.ISO_8859_1;
            ByteBuffer inputBuffer = ByteBuffer.wrap(stringFinal.getBytes());
            // decode ISO-8859-1
            CharBuffer decode = iso88591.decode(inputBuffer);

            return new String(decode.array());
        })
                .toJavaOptional()
                .orElse(s);

    }
}

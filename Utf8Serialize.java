public static class Utf8Serialize extends JsonSerializer<String> {

        @Override
        public void serialize(String s,
                              JsonGenerator jsonGenerator,
                              SerializerProvider serializerProvider) throws IOException {

            String decoded = Try.ofSupplier(() -> new String(s.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8))
                    .toJavaOptional()
                    .orElse(s);

            jsonGenerator.writeString(decoded);
        }
    }

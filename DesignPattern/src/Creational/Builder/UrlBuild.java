package Creational.Builder;

class URL {
    private final String protocol; // Required
    private final String hostname; // Required
    private final int port; // Optional (-1 means no port specified)
    private final String pathParam; // Optional
    private final String queryKey; // Optional
    private final String queryValue; // Optional

    private URL(Builder builder) {
        this.protocol = builder.protocol;
        this.hostname = builder.hostname;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.queryKey = builder.queryKey;
        this.queryValue = builder.queryValue;
    }

    public static class Builder {
        private final String protocol; // Required
        private final String hostname; // Required
        private int port = -1; // Optional
        private String pathParam = ""; // Optional
        private String queryKey = null; // Optional
        private String queryValue = null; // Optional

        public Builder(String protocol, String hostname) {
            if (protocol == null || hostname == null) {
                throw new IllegalArgumentException("Protocol and hostname are required!");
            }
            this.protocol = protocol;
            this.hostname = hostname;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setPathParam(String pathParam) {
            if (pathParam != null && !pathParam.isEmpty()) {
                this.pathParam = pathParam.startsWith("/") ? pathParam : "/" + pathParam;
            }
            return this;
        }

        public Builder setQueryParam(String key, String value) {
            if (key != null && value != null) {
                this.queryKey = key;
                this.queryValue = value;
            }
            return this;
        }

        public URL build() {
            return new URL(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder url = new StringBuilder();
        url.append(protocol).append("://").append(hostname);

        if (port != -1) {
            url.append(":").append(port);
        }

        url.append(pathParam);

        if (queryKey != null && queryValue != null) {
            url.append("?").append(queryKey).append("=").append(queryValue);
        }

        return url.toString();
    }
}

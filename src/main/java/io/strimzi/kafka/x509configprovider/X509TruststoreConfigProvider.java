package io.strimzi.kafka.x509configprovider;

import org.apache.kafka.common.config.ConfigChangeCallback;
import org.apache.kafka.common.config.ConfigData;
import org.apache.kafka.common.config.provider.ConfigProvider;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class X509TruststoreConfigProvider implements ConfigProvider {

    @Override
    public ConfigData get(String path) {
        return null;
    }

    @Override
    public ConfigData get(String path, Set<String> keys) {
        return null;
    }

    @Override
    public void subscribe(String path, Set<String> keys, ConfigChangeCallback callback) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unsubscribe(String path, Set<String> keys, ConfigChangeCallback callback) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unsubscribeAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public void configure(Map<String, ?> configs) {

    }
}

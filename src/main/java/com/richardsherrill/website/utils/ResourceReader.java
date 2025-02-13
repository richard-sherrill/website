package com.richardsherrill.website.utils;

import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Helper class to read resource files to an object
 */
public class ResourceReader {

    /**
     * Takes a resource file and converts the contents to a string
     * @param resource an instantiated resource object
     * @return the String representation of the resource file
     */
    public static String asString(final Resource resource) {
        try (final Reader reader = new InputStreamReader(resource.getInputStream(), UTF_8)) {
            return FileCopyUtils.copyToString(reader);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}

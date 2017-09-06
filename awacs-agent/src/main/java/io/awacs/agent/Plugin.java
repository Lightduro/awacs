package io.awacs.agent;

import io.awacs.common.Configuration;

/**
 * Interface for plugins
 * Created by pixyonly on 02/09/2017.
 */
public interface Plugin {

    void init(Configuration properties);

    void rock();

    void over();
}
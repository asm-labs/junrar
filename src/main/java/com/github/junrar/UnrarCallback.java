package com.github.junrar;


/**
 * @author alban
 */
public interface UnrarCallback {

    /**
     * Return <tt>true</tt> if the next volume is ready to be processed,
     * <tt>false</tt> otherwise.
     *
     * @param nextVolume next volume
     * @return {@code true}, if the next volume is ready to be processed
     */
    boolean isNextVolumeReady(Volume nextVolume);

    /**
     * This method is invoked each time the progress of the current
     * volume changes.
     *
     * @param current current volume progress
     * @param total   total progress
     */
    void volumeProgressChanged(long current, long total);
}

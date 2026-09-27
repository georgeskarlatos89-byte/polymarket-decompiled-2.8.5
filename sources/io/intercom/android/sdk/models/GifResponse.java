package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class GifResponse {
    private final List<Block> results;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        List<Block> results;

        public GifResponse build() {
            return new GifResponse(this.results);
        }
    }

    public GifResponse(List<Block> list) {
        this.results = list;
    }

    public List<Block> results() {
        return this.results;
    }
}

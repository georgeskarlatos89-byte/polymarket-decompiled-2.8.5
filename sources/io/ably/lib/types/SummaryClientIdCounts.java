package io.ably.lib.types;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class SummaryClientIdCounts {
    public final Map<String, Integer> clientIds;
    public final boolean clipped;
    public final int total;
    public final int totalClientIds;
    public final int totalUnidentified;

    public SummaryClientIdCounts(int i, Map<String, Integer> map, int i2, boolean z, int i3) {
        this.total = i;
        this.clientIds = map;
        this.totalUnidentified = i2;
        this.clipped = z;
        this.totalClientIds = i3;
    }
}

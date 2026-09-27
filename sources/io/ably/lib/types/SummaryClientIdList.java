package io.ably.lib.types;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class SummaryClientIdList {
    public final List<String> clientIds;
    public final boolean clipped;
    public final int total;

    public SummaryClientIdList(int i, List<String> list, boolean z) {
        this.total = i;
        this.clientIds = list;
        this.clipped = z;
    }
}

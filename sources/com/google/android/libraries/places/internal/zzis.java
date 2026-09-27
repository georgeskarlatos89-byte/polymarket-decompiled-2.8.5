package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzis {
    ROUTING_SUMMARIES,
    NEXT_PAGE_TOKEN,
    SEARCH_URI;

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return super.toString();
                }
                return "searchUri";
            }
            return "nextPageToken";
        }
        return "routing_summaries";
    }
}

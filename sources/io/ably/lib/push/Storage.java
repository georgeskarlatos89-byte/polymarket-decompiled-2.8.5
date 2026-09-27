package io.ably.lib.push;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface Storage {
    void clear(String[] strArr);

    int get(String str, int i);

    String get(String str, String str2);

    void put(String str, int i);

    void put(String str, String str2);
}

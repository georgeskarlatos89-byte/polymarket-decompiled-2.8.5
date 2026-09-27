package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import defpackage.yfa;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(ContextKindTypeAdapter.class)
/* loaded from: classes3.dex */
public final class d implements Comparable<d>, yfa {
    public static final d b = new d("user");
    public static final d c = new d("multi");
    public final String a;

    public d(String str) {
        this.a = str;
    }

    public static d a(String str) {
        if (str != null && !str.isEmpty() && !str.equals("user")) {
            if (str.equals("multi")) {
                return c;
            }
            return new d(str);
        }
        return b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        return this.a.compareTo(dVar.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (this != obj) {
                if (this.a.equals(((d) obj).a)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}

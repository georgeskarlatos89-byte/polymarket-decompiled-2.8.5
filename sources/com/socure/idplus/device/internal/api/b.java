package com.socure.idplus.device.internal.api;

import com.google.gson.Gson;
import defpackage.h6g;
import defpackage.k19;
import java.util.concurrent.TimeUnit;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final boolean b;
    public a c;
    public a d;
    public a e;

    public b(String str, boolean z, c cVar) {
        cVar.getClass();
        this.a = str;
        this.b = z;
    }

    public final a a(String str) {
        str.getClass();
        CertificatePinner build = new CertificatePinner.Builder().add("upload.socure.com", "sha256/u4G1dHiq3ZguTn0rEvWkWLb5RY6ci1CdDTVt3GHZc4Q=").add("upload.socure.com", "sha256/JSMzqOOrtyOT1kmau6zKhgT676hGgczD5VMdRMyJZFA=").add("upload.socure.com", "sha256/++MBgDH5WGvL9Bcn5Be30cRcL0f5O+NyoXuWtQdX1aI=").build();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(50L, timeUnit);
        builder.readTimeout(50L, timeUnit);
        builder.writeTimeout(50L, timeUnit);
        builder.certificatePinner(build);
        h6g h6gVar = new h6g();
        h6gVar.b(str);
        h6gVar.a(new k19(new Gson(), 0));
        Object b = h6gVar.c().b(a.class);
        b.getClass();
        return (a) b;
    }
}

package defpackage;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mhd {
    public final OkHttpClient a;

    public mhd() {
        hji hjiVar = new hji();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient build = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).sslSocketFactory(hjiVar, hjiVar.a).build();
        build.getClass();
        this.a = build;
    }
}

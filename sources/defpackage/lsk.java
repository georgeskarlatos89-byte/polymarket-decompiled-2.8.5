package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lsk extends Lambda implements Function0 {
    public static final lsk h = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MediaType mediaType = ssk.c;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.retryOnConnectionFailure(true);
        return builder.build();
    }
}

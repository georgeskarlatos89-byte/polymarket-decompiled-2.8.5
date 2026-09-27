package defpackage;

import java.net.URI;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class eg9 {
    public static URI a(URI uri, String str) {
        HttpUrl build = HttpUrl.get(uri).newBuilder().addPathSegments(str).build();
        List<String> pathSegments = build.pathSegments();
        HttpUrl.Builder newBuilder = build.newBuilder();
        for (int size = pathSegments.size() - 1; size >= 0; size--) {
            if (pathSegments.get(size).isEmpty()) {
                newBuilder.removePathSegment(size);
            }
        }
        return newBuilder.build().uri();
    }
}

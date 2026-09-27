package io.sentry;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface k1 {
    void a(Writer writer, Object obj);

    io.sentry.internal.debugmeta.c b(BufferedInputStream bufferedInputStream);

    void c(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream);

    Object d(Reader reader, Class cls);

    String e(Map map);
}

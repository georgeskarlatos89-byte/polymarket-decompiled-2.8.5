package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterApi;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes6.dex */
public class InterpreterFactory {
    public InterpreterApi create(File file, InterpreterApi.Options options) {
        return InterpreterApi.create(file, options);
    }

    public InterpreterApi create(ByteBuffer byteBuffer, InterpreterApi.Options options) {
        return InterpreterApi.create(byteBuffer, options);
    }
}

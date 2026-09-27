package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.InterpreterImpl;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import org.tensorflow.lite.nnapi.NnApiDelegateImpl;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class InterpreterFactoryImpl implements InterpreterFactoryApi {
    private static native String nativeRuntimeVersion();

    private static native String nativeSchemaVersion();

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public InterpreterApi create(File file, InterpreterApi.Options options) {
        InterpreterImpl.Options options2;
        if (options == null) {
            options2 = null;
        } else {
            options2 = new InterpreterImpl.Options(options);
        }
        return new InterpreterImpl(file, options2);
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public NnApiDelegate.PrivateInterface createNnApiDelegateImpl(NnApiDelegate.Options options) {
        return new NnApiDelegateImpl(options);
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public String runtimeVersion() {
        TensorFlowLite.init();
        return nativeRuntimeVersion();
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public String schemaVersion() {
        TensorFlowLite.init();
        return nativeSchemaVersion();
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public InterpreterApi create(ByteBuffer byteBuffer, InterpreterApi.Options options) {
        return new InterpreterImpl(byteBuffer, options == null ? null : new InterpreterImpl.Options(options));
    }
}

package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.InterpreterImpl;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class Interpreter extends InterpreterImpl implements InterpreterApi {
    private final NativeInterpreterWrapperExperimental wrapperExperimental;

    public Interpreter(File file, Options options) {
        this(new NativeInterpreterWrapperExperimental(file.getAbsolutePath(), options));
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void allocateTensors() {
        super.allocateTensors();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getInputIndex(String str) {
        return super.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getInputTensor(int i) {
        return super.getInputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getInputTensorCount() {
        return super.getInputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getInputTensorFromSignature(String str, String str2) {
        return super.getInputTensorFromSignature(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Long getLastNativeInferenceDurationNanoseconds() {
        return super.getLastNativeInferenceDurationNanoseconds();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getOutputIndex(String str) {
        return super.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getOutputTensor(int i) {
        return super.getOutputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getOutputTensorCount() {
        return super.getOutputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getOutputTensorFromSignature(String str, String str2) {
        return super.getOutputTensorFromSignature(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ String[] getSignatureInputs(String str) {
        return super.getSignatureInputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ String[] getSignatureKeys() {
        return super.getSignatureKeys();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ String[] getSignatureOutputs(String str) {
        return super.getSignatureOutputs(str);
    }

    public void resetVariableTensors() {
        checkNotClosed();
        this.wrapperExperimental.resetVariableTensors();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void resizeInput(int i, int[] iArr) {
        super.resizeInput(i, iArr);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void run(Object obj, Object obj2) {
        super.run(obj, obj2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runForMultipleInputsOutputs(Object[] objArr, Map map) {
        super.runForMultipleInputsOutputs(objArr, map);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runSignature(Map map, Map map2) {
        super.runSignature(map, map2);
    }

    public void setCancelled(boolean z) {
        this.wrapper.setCancelled(z);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class Options extends InterpreterImpl.Options {
        public Options() {
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public /* bridge */ /* synthetic */ InterpreterApi.Options addDelegate(Delegate delegate) {
            return addDelegate(delegate);
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public /* bridge */ /* synthetic */ InterpreterApi.Options addDelegateFactory(DelegateFactory delegateFactory) {
            return addDelegateFactory(delegateFactory);
        }

        public Options setAllowBufferHandleOutput(boolean z) {
            this.allowBufferHandleOutput = Boolean.valueOf(z);
            return this;
        }

        @Deprecated
        public Options setAllowFp16PrecisionForFp32(boolean z) {
            this.allowFp16PrecisionForFp32 = Boolean.valueOf(z);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public /* bridge */ /* synthetic */ InterpreterApi.Options setCancellable(boolean z) {
            return setCancellable(z);
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public /* bridge */ /* synthetic */ InterpreterApi.Options setNumThreads(int i) {
            return setNumThreads(i);
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public /* bridge */ /* synthetic */ InterpreterApi.Options setRuntime(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
            return setRuntime(tfLiteRuntime);
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public /* bridge */ /* synthetic */ InterpreterApi.Options setUseNNAPI(boolean z) {
            return setUseNNAPI(z);
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public /* bridge */ /* synthetic */ InterpreterApi.Options setUseXNNPACK(boolean z) {
            return setUseXNNPACK(z);
        }

        public Options(InterpreterApi.Options options) {
            super(options);
        }

        public Options(InterpreterImpl.Options options) {
            super(options);
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options addDelegate(Delegate delegate) {
            super.addDelegate(delegate);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options addDelegateFactory(DelegateFactory delegateFactory) {
            super.addDelegateFactory(delegateFactory);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setCancellable(boolean z) {
            super.setCancellable(z);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setNumThreads(int i) {
            super.setNumThreads(i);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setRuntime(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
            super.setRuntime(tfLiteRuntime);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setUseNNAPI(boolean z) {
            super.setUseNNAPI(z);
            return this;
        }

        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setUseXNNPACK(boolean z) {
            super.setUseXNNPACK(z);
            return this;
        }
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void resizeInput(int i, int[] iArr, boolean z) {
        super.resizeInput(i, iArr, z);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runSignature(Map map, Map map2, String str) {
        super.runSignature(map, map2, str);
    }

    public Interpreter(File file) {
        this(file, (Options) null);
    }

    public Interpreter(ByteBuffer byteBuffer) {
        this(byteBuffer, (Options) null);
    }

    public Interpreter(ByteBuffer byteBuffer, Options options) {
        this(new NativeInterpreterWrapperExperimental(byteBuffer, options));
    }

    private Interpreter(NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental) {
        super(nativeInterpreterWrapperExperimental);
        this.wrapperExperimental = nativeInterpreterWrapperExperimental;
    }
}

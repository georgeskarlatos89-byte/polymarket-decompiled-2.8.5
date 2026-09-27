package org.tensorflow.lite;

import com.appsflyer.internal.l;
import defpackage.dmk;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class InterpreterImpl implements InterpreterApi {
    private final String[] signatureKeyList = getSignatureKeys();
    NativeInterpreterWrapper wrapper;

    public InterpreterImpl(File file, Options options) {
        this.wrapper = new NativeInterpreterWrapper(file.getAbsolutePath(), options);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void allocateTensors() {
        checkNotClosed();
        this.wrapper.allocateTensors();
    }

    public void checkNotClosed() {
        if (this.wrapper != null) {
            return;
        }
        dmk.n("Internal error: The Interpreter has already been closed.");
    }

    @Override // org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.wrapper;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.wrapper = null;
        }
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public int getExecutionPlanLength() {
        checkNotClosed();
        return this.wrapper.getExecutionPlanLength();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getInputIndex(String str) {
        checkNotClosed();
        return this.wrapper.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getInputTensor(int i) {
        checkNotClosed();
        return this.wrapper.getInputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getInputTensorCount() {
        checkNotClosed();
        return this.wrapper.getInputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getInputTensorFromSignature(String str, String str2) {
        checkNotClosed();
        if (str2 == null) {
            String[] strArr = this.signatureKeyList;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 != null) {
            return this.wrapper.getInputTensor(str, str2);
        }
        l.k(Arrays.toString(this.signatureKeyList), "Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: ");
        return null;
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Long getLastNativeInferenceDurationNanoseconds() {
        checkNotClosed();
        return this.wrapper.getLastNativeInferenceDurationNanoseconds();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getOutputIndex(String str) {
        checkNotClosed();
        return this.wrapper.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getOutputTensor(int i) {
        checkNotClosed();
        return this.wrapper.getOutputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getOutputTensorCount() {
        checkNotClosed();
        return this.wrapper.getOutputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getOutputTensorFromSignature(String str, String str2) {
        checkNotClosed();
        if (str2 == null) {
            String[] strArr = this.signatureKeyList;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 != null) {
            return this.wrapper.getOutputTensor(str, str2);
        }
        l.k(Arrays.toString(this.signatureKeyList), "Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: ");
        return null;
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public String[] getSignatureInputs(String str) {
        checkNotClosed();
        return this.wrapper.getSignatureInputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public String[] getSignatureKeys() {
        checkNotClosed();
        return this.wrapper.getSignatureKeys();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public String[] getSignatureOutputs(String str) {
        checkNotClosed();
        return this.wrapper.getSignatureOutputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void resizeInput(int i, int[] iArr) {
        checkNotClosed();
        this.wrapper.resizeInput(i, iArr, false);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void run(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put(0, obj2);
        runForMultipleInputsOutputs(new Object[]{obj}, hashMap);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void runForMultipleInputsOutputs(Object[] objArr, Map<Integer, Object> map) {
        checkNotClosed();
        this.wrapper.run(objArr, map);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void runSignature(Map<String, Object> map, Map<String, Object> map2, String str) {
        checkNotClosed();
        if (str == null) {
            String[] strArr = this.signatureKeyList;
            if (strArr.length == 1) {
                str = strArr[0];
            }
        }
        if (str != null) {
            this.wrapper.runSignature(map, map2, str);
        } else {
            l.k(Arrays.toString(this.signatureKeyList), "Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: ");
        }
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void resizeInput(int i, int[] iArr, boolean z) {
        checkNotClosed();
        this.wrapper.resizeInput(i, iArr, z);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class Options extends InterpreterApi.Options {
        Boolean allowBufferHandleOutput;
        Boolean allowFp16PrecisionForFp32;

        public Options(Options options) {
            super(options);
            this.allowFp16PrecisionForFp32 = options.allowFp16PrecisionForFp32;
            this.allowBufferHandleOutput = options.allowBufferHandleOutput;
        }

        public Options(InterpreterApi.Options options) {
            super(options);
        }

        public Options() {
        }
    }

    public InterpreterImpl(ByteBuffer byteBuffer, Options options) {
        this.wrapper = new NativeInterpreterWrapper(byteBuffer, options);
    }

    public InterpreterImpl(NativeInterpreterWrapper nativeInterpreterWrapper) {
        this.wrapper = nativeInterpreterWrapper;
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void runSignature(Map<String, Object> map, Map<String, Object> map2) {
        checkNotClosed();
        runSignature(map, map2, null);
    }
}

package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.acceleration.ValidatedAccelerationConfig;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface InterpreterApi extends AutoCloseable {
    static InterpreterApi create(File file, Options options) {
        Options.TfLiteRuntime runtime;
        if (options == null) {
            runtime = null;
        } else {
            runtime = options.getRuntime();
        }
        return TensorFlowLite.getFactory(runtime).create(file, options);
    }

    void allocateTensors();

    @Override // java.lang.AutoCloseable
    void close();

    int getInputIndex(String str);

    Tensor getInputTensor(int i);

    int getInputTensorCount();

    Tensor getInputTensorFromSignature(String str, String str2);

    Long getLastNativeInferenceDurationNanoseconds();

    int getOutputIndex(String str);

    Tensor getOutputTensor(int i);

    int getOutputTensorCount();

    Tensor getOutputTensorFromSignature(String str, String str2);

    String[] getSignatureInputs(String str);

    String[] getSignatureKeys();

    String[] getSignatureOutputs(String str);

    void resizeInput(int i, int[] iArr);

    void resizeInput(int i, int[] iArr, boolean z);

    void run(Object obj, Object obj2);

    void runForMultipleInputsOutputs(Object[] objArr, Map<Integer, Object> map);

    void runSignature(Map<String, Object> map, Map<String, Object> map2);

    void runSignature(Map<String, Object> map, Map<String, Object> map2, String str);

    static InterpreterApi create(ByteBuffer byteBuffer, Options options) {
        return TensorFlowLite.getFactory(options == null ? null : options.getRuntime()).create(byteBuffer, options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class Options {
        Boolean allowCancellation;
        private final List<DelegateFactory> delegateFactories;
        final List<Delegate> delegates;
        int numThreads;
        TfLiteRuntime runtime;
        Boolean useNNAPI;
        Boolean useXNNPACK;
        ValidatedAccelerationConfig validatedAccelerationConfig;

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        /* loaded from: classes6.dex */
        public enum TfLiteRuntime {
            FROM_APPLICATION_ONLY,
            FROM_SYSTEM_ONLY,
            PREFER_SYSTEM_OVER_APPLICATION
        }

        public Options(Options options) {
            this.runtime = TfLiteRuntime.FROM_APPLICATION_ONLY;
            this.numThreads = -1;
            this.numThreads = options.numThreads;
            this.useNNAPI = options.useNNAPI;
            this.allowCancellation = options.allowCancellation;
            this.delegates = new ArrayList(options.delegates);
            this.delegateFactories = new ArrayList(options.delegateFactories);
            this.runtime = options.runtime;
            this.validatedAccelerationConfig = options.validatedAccelerationConfig;
            this.useXNNPACK = options.useXNNPACK;
        }

        public Options addDelegate(Delegate delegate) {
            this.delegates.add(delegate);
            return this;
        }

        public Options addDelegateFactory(DelegateFactory delegateFactory) {
            this.delegateFactories.add(delegateFactory);
            return this;
        }

        public ValidatedAccelerationConfig getAccelerationConfig() {
            return this.validatedAccelerationConfig;
        }

        public List<DelegateFactory> getDelegateFactories() {
            return Collections.unmodifiableList(this.delegateFactories);
        }

        public List<Delegate> getDelegates() {
            return Collections.unmodifiableList(this.delegates);
        }

        public int getNumThreads() {
            return this.numThreads;
        }

        public TfLiteRuntime getRuntime() {
            return this.runtime;
        }

        public boolean getUseNNAPI() {
            Boolean bool = this.useNNAPI;
            if (bool != null && bool.booleanValue()) {
                return true;
            }
            return false;
        }

        public boolean getUseXNNPACK() {
            Boolean bool = this.useXNNPACK;
            if (bool != null && !bool.booleanValue()) {
                return false;
            }
            return true;
        }

        public boolean isCancellable() {
            Boolean bool = this.allowCancellation;
            if (bool != null && bool.booleanValue()) {
                return true;
            }
            return false;
        }

        public Options setAccelerationConfig(ValidatedAccelerationConfig validatedAccelerationConfig) {
            this.validatedAccelerationConfig = validatedAccelerationConfig;
            return this;
        }

        public Options setCancellable(boolean z) {
            this.allowCancellation = Boolean.valueOf(z);
            return this;
        }

        public Options setNumThreads(int i) {
            this.numThreads = i;
            return this;
        }

        public Options setRuntime(TfLiteRuntime tfLiteRuntime) {
            this.runtime = tfLiteRuntime;
            return this;
        }

        public Options setUseNNAPI(boolean z) {
            this.useNNAPI = Boolean.valueOf(z);
            return this;
        }

        public Options setUseXNNPACK(boolean z) {
            this.useXNNPACK = Boolean.valueOf(z);
            return this;
        }

        public Options() {
            this.runtime = TfLiteRuntime.FROM_APPLICATION_ONLY;
            this.numThreads = -1;
            this.delegates = new ArrayList();
            this.delegateFactories = new ArrayList();
        }
    }
}

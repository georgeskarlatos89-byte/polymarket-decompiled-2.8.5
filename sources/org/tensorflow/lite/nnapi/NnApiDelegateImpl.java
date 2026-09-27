package org.tensorflow.lite.nnapi;

import defpackage.dmk;
import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class NnApiDelegateImpl implements NnApiDelegate.PrivateInterface, Delegate, AutoCloseable {
    private static final long INVALID_DELEGATE_HANDLE = 0;
    private long delegateHandle;

    public NnApiDelegateImpl(NnApiDelegate.Options options) {
        boolean z;
        TensorFlowLite.init();
        int executionPreference = options.getExecutionPreference();
        String acceleratorName = options.getAcceleratorName();
        String cacheDir = options.getCacheDir();
        String modelToken = options.getModelToken();
        int maxNumberOfDelegatedPartitions = options.getMaxNumberOfDelegatedPartitions();
        if (options.getUseNnapiCpu() != null) {
            z = true;
        } else {
            z = false;
        }
        this.delegateHandle = createDelegate(executionPreference, acceleratorName, cacheDir, modelToken, maxNumberOfDelegatedPartitions, z, options.getUseNnapiCpu() == null || !options.getUseNnapiCpu().booleanValue(), options.getAllowFp16(), options.getNnApiSupportLibraryHandle());
    }

    private void checkNotClosed() {
        if (this.delegateHandle != 0) {
            return;
        }
        dmk.n("Should not access delegate after it has been closed.");
    }

    private static native long createDelegate(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3, long j);

    private static native void deleteDelegate(long j);

    private static native int getNnapiErrno(long j);

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface, org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.delegateHandle;
        if (j != 0) {
            deleteDelegate(j);
            this.delegateHandle = 0L;
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        return this.delegateHandle;
    }

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface
    public int getNnapiErrno() {
        checkNotClosed();
        return getNnapiErrno(this.delegateHandle);
    }
}

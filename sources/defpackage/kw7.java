package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageReader;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kw7 implements AutoCloseable {
    public final OutputConfiguration a;
    public final ImageReader b;

    public kw7(OutputConfiguration outputConfiguration, ImageReader imageReader) {
        this.a = outputConfiguration;
        this.b = imageReader;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ImageReader imageReader = this.b;
        if (imageReader != null) {
            imageReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kw7) {
                kw7 kw7Var = (kw7) obj;
                if (!Intrinsics.areEqual(this.a, kw7Var.a) || !Intrinsics.areEqual(this.b, kw7Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        ImageReader imageReader = this.b;
        if (imageReader == null) {
            hashCode = 0;
        } else {
            hashCode = imageReader.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "CloseableOutputConfiguration(value=" + this.a + ", backingImageReader=" + this.b + ')';
    }
}

package io.sentry.android.core.anr;

import io.sentry.util.q;
import java.io.DataOutputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f implements Comparable {
    public final StackTraceElement[] a;
    public final long b;

    public f(long j, StackTraceElement[] stackTraceElementArr) {
        this.b = j;
        this.a = stackTraceElementArr;
    }

    public final void a(DataOutputStream dataOutputStream) {
        boolean z;
        dataOutputStream.writeShort(1);
        dataOutputStream.writeLong(this.b);
        StackTraceElement[] stackTraceElementArr = this.a;
        dataOutputStream.writeInt(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            Charset charset = q.a;
            String str = "";
            if (className == null) {
                className = "";
            }
            dataOutputStream.writeUTF(className);
            String methodName = stackTraceElement.getMethodName();
            if (methodName == null) {
                methodName = "";
            }
            dataOutputStream.writeUTF(methodName);
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                z = true;
            } else {
                z = false;
            }
            dataOutputStream.writeBoolean(z);
            if (fileName != null) {
                str = fileName;
            }
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeInt(stackTraceElement.getLineNumber());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((f) obj).b);
    }
}

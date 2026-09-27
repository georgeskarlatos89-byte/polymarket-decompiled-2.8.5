package defpackage;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import java.io.PrintWriter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eob extends aob {
    public final LifecycleOwner a;
    public final dob b;

    public eob(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.a = lifecycleOwner;
        this.b = (dob) new oak(viewModelStore, dob.d).a(lvf.a.getOrCreateKotlinClass(dob.class));
    }

    public final void b(String str, PrintWriter printWriter) {
        boolean z;
        dob dobVar = this.b;
        if (dobVar.b.n() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < dobVar.b.n(); i++) {
                bob bobVar = (bob) dobVar.b.o(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(dobVar.b.j(i));
                printWriter.print(": ");
                printWriter.println(bobVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(bobVar.l);
                d4l d4lVar = bobVar.l;
                String concat = str2.concat("  ");
                d4lVar.getClass();
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(d4lVar.a);
                if (d4lVar.b || d4lVar.e) {
                    printWriter.print(concat);
                    printWriter.print("mStarted=");
                    printWriter.print(d4lVar.b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(d4lVar.e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (d4lVar.c || d4lVar.d) {
                    printWriter.print(concat);
                    printWriter.print("mAbandoned=");
                    printWriter.print(d4lVar.c);
                    printWriter.print(" mReset=");
                    printWriter.println(d4lVar.d);
                }
                if (d4lVar.g != null) {
                    printWriter.print(concat);
                    printWriter.print("mTask=");
                    printWriter.print(d4lVar.g);
                    printWriter.print(" waiting=");
                    d4lVar.g.getClass();
                    printWriter.println(false);
                }
                if (d4lVar.h != null) {
                    printWriter.print(concat);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(d4lVar.h);
                    printWriter.print(" waiting=");
                    d4lVar.h.getClass();
                    printWriter.println(false);
                }
                if (bobVar.n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(bobVar.n);
                    cob cobVar = bobVar.n;
                    String concat2 = str2.concat("  ");
                    cobVar.getClass();
                    printWriter.print(concat2);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(cobVar.b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                d4l d4lVar2 = bobVar.l;
                Object d = bobVar.d();
                d4lVar2.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (d == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = d.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                if (bobVar.c > 0) {
                    z = true;
                } else {
                    z = false;
                }
                printWriter.println(z);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}

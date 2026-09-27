package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class x08 extends u08 {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ z08 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x08(z08 z08Var, File file) {
        super(file);
        file.getClass();
        this.e = z08Var;
    }

    @Override // defpackage.a18
    public final File a() {
        Function2 function2;
        b18 b18Var = this.e.d;
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            Function1 function1 = b18Var.c;
            if (function1 == null || ((Boolean) function1.invoke(file)).booleanValue()) {
                this.b = true;
                return file;
            }
        } else {
            File[] fileArr = this.c;
            if (fileArr != null && this.d >= fileArr.length) {
                Function1 function12 = b18Var.d;
                if (function12 != null) {
                    function12.invoke(file);
                    return null;
                }
            } else {
                if (fileArr == null) {
                    File[] listFiles = file.listFiles();
                    this.c = listFiles;
                    if (listFiles == null && (function2 = b18Var.e) != null) {
                        File file2 = this.a;
                        function2.invoke(file2, new j6(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    fileArr = this.c;
                    if (fileArr == null || fileArr.length == 0) {
                        Function1 function13 = b18Var.d;
                        if (function13 != null) {
                            function13.invoke(file);
                        }
                    }
                }
                fileArr.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr[i];
            }
        }
        return null;
    }
}

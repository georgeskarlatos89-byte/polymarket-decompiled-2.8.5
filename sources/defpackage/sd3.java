package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lsd3;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "gmn", "3ds2sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class sd3 extends Exception {
    public static final /* synthetic */ int d = 0;
    public final int a;
    public final String b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sd3(int i, String str, String str2) {
        super(woa.r(r0, str2, ")"));
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" - ");
        sb.append(str);
        sb.append(" (");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sd3(fgf fgfVar, String str) {
        this(fgfVar.a(), fgfVar.b(), str);
        fgfVar.getClass();
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.sentry.android.core.m0;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wgd implements gj1, qj0, OffsetMapping, e5k {
    public static final byte[] e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, MessagePack.Code.FIXEXT2, MessagePack.Code.BIN16, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;

    public wgd(Context context, XmlResourceParser xmlResourceParser) {
        this.a = 3;
        this.d = new ArrayList();
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), nlf.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new hz4().c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static void y(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byte b;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        boolean z2 = false;
        byteBuffer.put((byte) 0);
        if (z) {
            b = 2;
        } else {
            b = 0;
        }
        byteBuffer.put(b);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        if ((j2 >> 8) == 0) {
            z2 = true;
        }
        brn.d(j2, "out of range: %s", z2);
        byteBuffer.put((byte) j2);
    }

    public synchronized int A() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = rpk.a((Context) this.d).i(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e2) {
                m0.p("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    @Override // defpackage.qj0
    public void b(int i, int i2, int i3) {
        int i4;
        if (this.c == 0) {
            i4 = this.b;
        } else {
            i4 = 0;
        }
        ((qj0) this.d).b(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.qj0
    public void c(int i, int i2) {
        int i3;
        qj0 qj0Var = (qj0) this.d;
        if (this.c == 0) {
            i3 = this.b;
        } else {
            i3 = 0;
        }
        qj0Var.c(i + i3, i2);
    }

    @Override // defpackage.qj0
    public void e(Object obj, Function2 function2) {
        ((qj0) this.d).e(obj, function2);
    }

    @Override // defpackage.qj0
    public void f(int i, Object obj) {
        int i2;
        qj0 qj0Var = (qj0) this.d;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        qj0Var.f(i + i2, obj);
    }

    @Override // defpackage.qj0
    public Object h() {
        return ((qj0) this.d).h();
    }

    @Override // defpackage.e5k
    public int i() {
        return this.c;
    }

    @Override // defpackage.gj1
    public int j() {
        int i = this.b;
        if (i == -1) {
            return ((svd) this.d).x();
        }
        return i;
    }

    @Override // defpackage.e5k
    public int k() {
        return this.b;
    }

    @Override // defpackage.qj0
    public void m(int i, Object obj) {
        int i2;
        qj0 qj0Var = (qj0) this.d;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        qj0Var.m(i + i2, obj);
    }

    @Override // defpackage.qj0
    public void n(Object obj) {
        this.c++;
        ((qj0) this.d).n(obj);
    }

    @Override // defpackage.qj0
    public void o() {
        ((qj0) this.d).o();
    }

    @Override // defpackage.gj1
    public int p() {
        return this.b;
    }

    @Override // defpackage.qj0
    public void q() {
        if (this.c <= 0) {
            uq4.a("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        ((qj0) this.d).q();
    }

    @Override // defpackage.c5k
    public sa0 r(long j, sa0 sa0Var, sa0 sa0Var2, sa0 sa0Var3) {
        return ((a7h) this.d).r(j, sa0Var, sa0Var2, sa0Var3);
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int s(int i) {
        int s = ((OffsetMapping) this.d).s(i);
        if (i >= 0 && i <= this.c) {
            y2k.c(s, this.b, i);
        }
        return s;
    }

    @Override // defpackage.gj1
    public int t() {
        return this.c;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b != 0) {
                            if (b != 1) {
                                sb.append("  ");
                            } else {
                                sb.append(" 1");
                            }
                        } else {
                            sb.append(" 0");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.c5k
    public sa0 u(long j, sa0 sa0Var, sa0 sa0Var2, sa0 sa0Var3) {
        return ((a7h) this.d).u(j, sa0Var, sa0Var2, sa0Var3);
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int v(int i) {
        int v = ((OffsetMapping) this.d).v(i);
        if (i >= 0 && i <= this.b) {
            y2k.b(v, this.c, i);
        }
        return v;
    }

    public byte w(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public void x(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public synchronized int z() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (rpk.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            m0.d("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        m0.p("Metadata", "Failed to resolve IID implementation package, falling back");
        this.c = 2;
        return 2;
    }

    public wgd(Context context) {
        this.a = 9;
        this.c = 0;
        this.d = context;
    }

    public /* synthetic */ wgd(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public wgd(int i, int i2) {
        this.a = 2;
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public wgd(OffsetMapping offsetMapping, int i, int i2) {
        this.a = 7;
        this.d = offsetMapping;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ wgd() {
        this.a = 0;
    }

    public wgd(qj0 qj0Var, int i) {
        this.a = 5;
        this.d = qj0Var;
        this.b = i;
    }

    public wgd(int i, int i2, w57 w57Var) {
        this.a = 8;
        this.b = i;
        this.c = i2;
        this.d = new a7h(new p88(i, i2, w57Var));
    }

    public wgd(nmc nmcVar, el8 el8Var) {
        this.a = 1;
        svd svdVar = nmcVar.c;
        this.d = svdVar;
        svdVar.F(12);
        int x = svdVar.x();
        if ("audio/raw".equals(el8Var.n)) {
            int s = u1k.s(el8Var.F) * el8Var.D;
            if (x == 0 || x % s != 0) {
                q7m.g("BoxParsers", "Audio sample size mismatch. stsd sample size: " + s + ", stsz sample size: " + x);
                x = s;
            }
        }
        this.b = x == 0 ? -1 : x;
        this.c = svdVar.x();
    }
}

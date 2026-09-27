package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.b;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class woa {
    public static void A(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public static int B(int i, int i2, int i3) {
        return b94.h(i) + i2 + i3;
    }

    public static int a(float f, float f2, float f3) {
        return Math.round((f / f2) * f3);
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return b94.i(i) + i2 + i3 + i4;
    }

    public static int d(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int e(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }

    public static int f(Date date, int i, int i2) {
        return (date.hashCode() + i) * i2;
    }

    public static long g(float f, long j, long j2) {
        return f9m.k(cyi.c(j) * f, j2);
    }

    public static gvd h(float f, sr8 sr8Var) {
        gvd gvdVar = new gvd(f);
        sr8Var.o0(gvdVar);
        return gvdVar;
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Long j(MessageDao_Impl messageDao_Impl, Date date) {
        MessageDao_Impl.access$get__dateConverter$p(messageDao_Impl).getClass();
        return ys5.a(date);
    }

    public static String k(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String l(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String m(long j, String str) {
        return str + j;
    }

    public static String n(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String o(String str, Object obj, String str2) {
        return str + obj + str2;
    }

    public static String p(String str, String str2, Throwable th) {
        return str + th + str2;
    }

    public static String q(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static Iterator s(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void t(int i, sr8 sr8Var, n70 n70Var, sr8 sr8Var2, t31 t31Var) {
        zzm.a(sr8Var, Integer.valueOf(i), n70Var);
        zzm.b(sr8Var2, t31Var);
    }

    public static void u(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void v(int i, Function2 function2, sr8 sr8Var, boolean z) {
        function2.invoke(sr8Var, Integer.valueOf(i));
        sr8Var.s(z);
    }

    public static void w(int i, Function2 function2, sr8 sr8Var, boolean z, boolean z2) {
        function2.invoke(sr8Var, Integer.valueOf(i));
        sr8Var.s(z);
        sr8Var.s(z2);
    }

    public static void x(long j, String str, StringBuilder sb) {
        sb.append((Object) ib4.h(j));
        sb.append(str);
    }

    public static void y(sr8 sr8Var, int i, hjc hjcVar, float f, sr8 sr8Var2) {
        sr8Var.e0(i);
        wnl.a(sr8Var2, b.e(hjcVar, f));
    }

    public static void z(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }
}

package defpackage;

import androidx.compose.foundation.layout.b;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.GlobalsKt;
import skip.lib.UnkeyedDecodingContainer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class m51 {
    public static void A(StringBuilder sb, DownstreamUserDto downstreamUserDto, String str, String str2, String str3) {
        sb.append(downstreamUserDto);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cta, java.lang.RuntimeException] */
    public static cta B(String str) {
        GlobalsKt.fatalError(str);
        return new RuntimeException();
    }

    public static String C(String str, String str2, String str3, String str4) {
        return (str + str2 + str3 + str4).toString();
    }

    public static void D(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1190decodeBwKQO78(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static int a(ns2 ns2Var, int i, int i2) {
        return (ns2Var.hashCode() + i) * i2;
    }

    public static int b(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cta, java.lang.RuntimeException] */
    public static cta c(String str) {
        sjb.c(str);
        return new RuntimeException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cta, java.lang.RuntimeException] */
    public static cta d(String str, int i, Object obj) {
        GlobalsKt.fatalError$default(str, i, obj);
        return new RuntimeException();
    }

    public static fpc e(sr8 sr8Var) {
        fpc fpcVar = new fpc();
        sr8Var.o0(fpcVar);
        return fpcVar;
    }

    public static AblyException f(int i, int i2, String str) {
        return AblyException.fromErrorInfo(new ErrorInfo(str, i, i2));
    }

    public static ClassCastException g(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object h(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String i(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb.toString();
    }

    public static String j(int i, String str, int i2, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String m(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder n(int i, String str, int i2, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder o(ExactDate exactDate, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(exactDate);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder p(String str, pgj pgjVar, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(pgjVar);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void s(float f, boolean z, sr8 sr8Var) {
        wnl.a(sr8Var, new zxa(z, f));
    }

    public static void t(sr8 sr8Var, int i, hjc hjcVar, float f, sr8 sr8Var2) {
        sr8Var.e0(i);
        wnl.a(sr8Var2, b.q(hjcVar, f));
    }

    public static void u(sr8 sr8Var, boolean z, hjc hjcVar, float f, sr8 sr8Var2) {
        sr8Var.s(z);
        wnl.a(sr8Var2, b.e(hjcVar, f));
    }

    public static void v(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1205decode(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static void w(ExactDate exactDate, String str, String str2, String str3, String str4) {
        str.getClass();
        exactDate.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public static void x(String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3) {
        str.getClass();
        exactDate.getClass();
        downstreamUserDto.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void y(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void z(String str, Date date, String str2, User user, String str3) {
        str.getClass();
        date.getClass();
        str2.getClass();
        user.getClass();
        str3.getClass();
    }
}

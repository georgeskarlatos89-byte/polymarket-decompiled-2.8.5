package defpackage;

import com.squareup.moshi.JsonAdapter;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.UnkeyedDecodingContainer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class k84 {
    public static void A(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1201decode(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static void B(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1199decode(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static void C(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1198decode(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static void D(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        UByte.m884boximpl(unkeyedDecodingContainer.mo1193decodeWa3L5BU(qvfVar.getOrCreateKotlinClass(cls)));
        Intrinsics.h();
        throw null;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static hg8 b(sr8 sr8Var) {
        hg8 hg8Var = new hg8();
        sr8Var.o0(hg8Var);
        return hg8Var;
    }

    public static zxa c(sr8 sr8Var, kjc kjcVar, n70 n70Var, float f, boolean z) {
        zzm.d(sr8Var, kjcVar, n70Var);
        return new zxa(z, f);
    }

    public static toi d(String str, float f, float f2) {
        str.getClass();
        return new toi(f, f2);
    }

    public static String e(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static String f(Object obj, String str) {
        return str + obj;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder h(String str, String str2, String str3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static void i(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void j(int i, sr8 sr8Var, n70 n70Var, sr8 sr8Var2, t31 t31Var) {
        zzm.d(sr8Var, Integer.valueOf(i), n70Var);
        zzm.b(sr8Var2, t31Var);
    }

    public static void k(int i, String str, String str2) {
        q7m.g(str2, str + i);
    }

    public static void l(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void m(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void n(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1192decodeOGnWXxg(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static void o(String str, String str2, String str3) {
        q7m.g(str3, str + str2);
    }

    public static void p(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static void q(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void r(Throwable th, Continuation continuation) {
        continuation.resumeWith(Result.m882constructorimpl(ResultKt.createFailure(th)));
    }

    public static void s(boolean z, JsonAdapter jsonAdapter, wga wgaVar, String str) {
        jsonAdapter.toJson(wgaVar, Boolean.valueOf(z));
        wgaVar.A(str);
    }

    public static boolean t(sr8 sr8Var, boolean z, int i, ConversationViewModel conversationViewModel) {
        sr8Var.s(z);
        sr8Var.e0(i);
        return sr8Var.j(conversationViewModel);
    }

    public static String u(Object obj, String str) {
        return (str + obj).toString();
    }

    public static void v(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1191decodeI7RO_PI(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static void w(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1203decode(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static void x(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.decode(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static void y(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1204decode(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }

    public static void z(qvf qvfVar, Class cls, UnkeyedDecodingContainer unkeyedDecodingContainer) {
        unkeyedDecodingContainer.mo1200decode(qvfVar.getOrCreateKotlinClass(cls));
        Intrinsics.h();
        throw null;
    }
}

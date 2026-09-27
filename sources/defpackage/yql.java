package defpackage;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class yql {
    public static gu8 a(String str, String str2) {
        Exception b;
        str.getClass();
        try {
            ru8 ru8Var = new ru8(new h0(26), null);
            if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                b = uxn.b(new h0(0), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                b = uxn.b(new h0(1), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                b = uxn.b(new h0(2), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                b = uxn.b(new h0(3), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                b = uxn.b(new h0(4), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                b = uxn.b(new h0(5), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                b = uxn.b(new h0(6), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                b = uxn.b(new h0(7), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                b = uxn.b(new h0(8), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                b = uxn.b(new h0(9), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                b = uxn.b(new h0(10), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                b = uxn.b(new h0(11), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                b = uxn.b(new h0(12), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                b = uxn.b(new h0(13), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                b = uxn.b(new h0(14), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                b = uxn.b(new h0(15), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                b = uxn.b(new h0(16), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                b = uxn.b(new h0(17), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                b = uxn.b(new h0(18), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                b = uxn.b(new h0(19), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                b = uxn.b(new h0(20), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                b = uxn.b(new h0(21), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                b = uxn.b(new h0(22), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                b = uxn.b(new h0(23), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                b = uxn.b(new h0(24), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                b = uxn.b(new h0(25), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                b = uxn.b(new h0(26), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                b = uxn.b(new h0(27), str2, ru8Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                b = uxn.b(new h0(28), str2, ru8Var);
            } else {
                throw new Exception();
            }
            return (gu8) b;
        } catch (po8 unused) {
            return new fu8(str2, str);
        }
    }

    public static final kjc b(kjc kjcVar, Function1 function1) {
        return kjcVar.e(new u07(function1));
    }

    public static final kjc c(kjc kjcVar, Function1 function1) {
        return kjcVar.e(new b17(function1));
    }

    public static final kjc d(kjc kjcVar, Function1 function1) {
        return kjcVar.e(new c17(function1));
    }

    public static String e(leh lehVar, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        lehVar.getClass();
        charset.getClass();
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return h1k.b(lehVar);
        }
        return ht2.b(charset.newDecoder(), lehVar);
    }

    public static final byte[] f(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        Charset charset2 = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, charset2)) {
            int length = str.length();
            h3 h3Var = l3.a;
            int length2 = str.length();
            h3Var.getClass();
            h3.a(0, length, length2);
            CharsetEncoder newEncoder = charset2.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
            if (encode.hasArray() && encode.arrayOffset() == 0) {
                int remaining = encode.remaining();
                byte[] array = encode.array();
                array.getClass();
                if (remaining == array.length) {
                    byte[] array2 = encode.array();
                    array2.getClass();
                    return array2;
                }
            }
            byte[] bArr = new byte[encode.remaining()];
            encode.get(bArr);
            return bArr;
        }
        return fnn.a(charset.newEncoder(), str, 0, str.length());
    }
}

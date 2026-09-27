package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageStringCodingException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class w2 extends x2 implements h3k {
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;
    public volatile String b;
    public volatile CharacterCodingException c;

    public w2(String str) {
        this.b = str;
        this.a = str.getBytes(MessagePack.UTF8);
    }

    public static void E(StringBuilder sb, String str) {
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ') {
                switch (charAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    case 11:
                    default:
                        I(charAt, sb);
                        break;
                    case '\f':
                        sb.append("\\f");
                        break;
                    case '\r':
                        sb.append("\\r");
                        break;
                }
            } else if (charAt <= 127) {
                if (charAt != '\"') {
                    if (charAt != '\\') {
                        sb.append(charAt);
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\\"");
                }
            } else if (charAt >= 55296 && charAt <= 57343) {
                I(charAt, sb);
            } else {
                sb.append(charAt);
            }
        }
        sb.append("\"");
    }

    public static void I(int i, StringBuilder sb) {
        sb.append("\\u");
        char[] cArr = d;
        sb.append(cArr[(i >> 12) & 15]);
        sb.append(cArr[(i >> 8) & 15]);
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    public final String F() {
        if (this.b == null) {
            H();
        }
        if (this.c == null) {
            return this.b;
        }
        throw new MessageStringCodingException(this.c);
    }

    public final void H() {
        synchronized (this.a) {
            if (this.b != null) {
                return;
            }
            try {
                CharsetDecoder newDecoder = MessagePack.UTF8.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                this.b = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
            } catch (CharacterCodingException e) {
                try {
                    CharsetDecoder newDecoder2 = MessagePack.UTF8.newDecoder();
                    CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
                    this.b = newDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
                    this.c = e;
                } catch (CharacterCodingException e2) {
                    throw new MessageStringCodingException(e2);
                }
            }
        }
    }

    @Override // defpackage.h3k
    public final String h() {
        StringBuilder sb = new StringBuilder();
        E(sb, toString());
        return sb.toString();
    }

    public final String toString() {
        if (this.b == null) {
            H();
        }
        return this.b;
    }

    public w2(byte[] bArr) {
        this.a = bArr;
    }
}

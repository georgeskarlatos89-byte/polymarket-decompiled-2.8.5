package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class uk9 extends rhl {
    public static final Pattern d = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder b = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder c = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.rhl
    public final bfc b(gfc gfcVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.c;
        CharsetDecoder charsetDecoder2 = this.b;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new bfc(new wk9(bArr, null, null));
        }
        Matcher matcher = d.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String c = lfn.c(group);
                c.getClass();
                if (!c.equals("streamurl")) {
                    if (c.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new bfc(new wk9(bArr, str2, str3));
    }
}

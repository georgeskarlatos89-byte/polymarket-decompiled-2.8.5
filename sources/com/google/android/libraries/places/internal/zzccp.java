package com.google.android.libraries.places.internal;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.brn;
import defpackage.dmk;
import defpackage.dr9;
import defpackage.jr9;
import defpackage.woa;
import io.ably.lib.util.AgentHeaderCreator;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzccp {
    static final BitSet zza = BitSet.valueOf(new long[]{287948901175001088L});
    static final BitSet zzb = BitSet.valueOf(new long[]{0, 576460743847706622L});
    static final BitSet zzc = BitSet.valueOf(new long[]{288063250384289792L, 576460743847706622L});
    static final BitSet zzd = BitSet.valueOf(new long[]{288054454291267584L, 5188146764422578174L});
    static final BitSet zze;
    static final BitSet zzf;
    static final BitSet zzg;
    static final BitSet zzh;
    static final BitSet zzi;
    static final BitSet zzj;
    public static final /* synthetic */ int zzk = 0;
    private static final char[] zzs;
    private final String zzl;
    private final String zzm;
    private final String zzn;
    private final String zzo;
    private final String zzp;
    private final String zzq;
    private final String zzr;

    static {
        BitSet.valueOf(new long[]{-8935000888854970368L, 671088641});
        BitSet.valueOf(new long[]{2882338748320710656L});
        BitSet.valueOf(new long[]{-6052662140534259712L, 671088641});
        zze = BitSet.valueOf(new long[]{3170393202611978240L, 5188146764422578174L});
        zzf = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578174L});
        zzg = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578175L});
        zzh = BitSet.valueOf(new long[]{3458764316252045312L, 5188146764422578175L});
        BitSet valueOf = BitSet.valueOf(new long[]{-5764607720602730496L, 5188146764422578175L});
        zzi = valueOf;
        zzj = valueOf;
        zzs = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public /* synthetic */ zzccp(zzcco zzccoVar, byte[] bArr) {
        String zzl = zzccoVar.zzl();
        brn.m(zzl, "scheme");
        this.zzl = zzl;
        this.zzm = zzccoVar.zzp();
        this.zzn = zzccoVar.zzq();
        this.zzo = zzccoVar.zzr();
        String zzm = zzccoVar.zzm();
        this.zzp = zzm;
        this.zzq = zzccoVar.zzn();
        this.zzr = zzccoVar.zzo();
        if (zzj()) {
            if (!zzm.isEmpty() && !zzm.startsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
                dmk.v("Has authority -- Non-empty path must start with '/'");
                throw null;
            }
            return;
        }
        if (!zzm.startsWith("//")) {
            return;
        }
        dmk.v("No authority -- Path cannot start with '//'");
        throw null;
    }

    public static zzccp zza(String str) {
        zzcco zzccoVar = new zzcco(null);
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if (charAt == '/' || charAt == '?' || charAt == '#') {
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        i = -1;
        if (i >= 0) {
            zzccoVar.zzb(str.substring(0, i));
            int i2 = i + 1;
            int i3 = i + 2;
            if (i3 < length && str.charAt(i2) == '/' && str.charAt(i3) == '/') {
                int i4 = i + 3;
                i2 = i4;
                while (i2 < length) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 == '/' || charAt2 == '?' || charAt2 == '#') {
                        break;
                    }
                    i2++;
                }
                zzccoVar.zzj(str.substring(i4, i2));
            }
            int i5 = i2;
            while (i5 < length) {
                char charAt3 = str.charAt(i5);
                if (charAt3 == '?' || charAt3 == '#') {
                    break;
                }
                i5++;
            }
            zzccoVar.zzd(str.substring(i2, i5));
            if (i5 < length && str.charAt(i5) == '?') {
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < length && str.charAt(i7) != '#') {
                    i7++;
                }
                zzccoVar.zze(str.substring(i6, i7));
                i5 = i7;
            }
            if (i5 < length && str.charAt(i5) == '#') {
                zzccoVar.zzf(str.substring(i5 + 1));
            }
            return zzccoVar.zzk();
        }
        dmk.v("Missing required scheme.");
        return null;
    }

    public static zzcco zze() {
        return new zzcco(null);
    }

    public static /* synthetic */ void zzf(String str, dr9 dr9Var) {
        zzi(str, null);
    }

    public static /* synthetic */ String zzg(String str, BitSet bitSet) {
        return zzn(str, bitSet);
    }

    public static /* synthetic */ void zzh(String str, String str2, BitSet bitSet) {
        zzl(str, str2, bitSet, null);
    }

    private static void zzi(String str, dr9 dr9Var) {
        String substring;
        int length;
        int i = str.startsWith(AgentHeaderCreator.AGENT_DIVIDER);
        while (i < str.length()) {
            int indexOf = str.indexOf(47, i);
            if (indexOf >= 0) {
                substring = str.substring(i, indexOf);
                length = indexOf + 1;
            } else {
                substring = str.substring(i);
                length = str.length();
            }
            if (dr9Var != null) {
                dr9Var.a(zzm(substring));
            } else {
                zzl(substring, "path segment", zzg, null);
            }
            i = length;
        }
        if (str.endsWith(AgentHeaderCreator.AGENT_DIVIDER) && dr9Var != null) {
            dr9Var.a("");
        }
    }

    private final boolean zzj() {
        if (this.zzn != null) {
            return true;
        }
        return false;
    }

    private final void zzk(StringBuilder sb) {
        String str = this.zzm;
        if (str != null) {
            sb.append(str);
            sb.append('@');
        }
        String str2 = this.zzn;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.zzo;
        if (str3 != null) {
            sb.append(':');
            sb.append(str3);
        }
    }

    private static void zzl(CharSequence charSequence, String str, BitSet bitSet, ByteBuffer byteBuffer) {
        int i = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '%') {
                int i2 = i + 2;
                if (i2 < charSequence.length()) {
                    int digit = Character.digit(charSequence.charAt(i + 1), 16);
                    int digit2 = Character.digit(charSequence.charAt(i2), 16);
                    if (digit != -1 && digit2 != -1) {
                        if (byteBuffer != null) {
                            byteBuffer.put((byte) ((digit << 4) | digit2));
                        }
                        i = i2;
                    } else {
                        String valueOf = String.valueOf(charSequence);
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + str.length() + 31 + 5 + valueOf.length());
                        sb.append("Invalid hex digit in ");
                        sb.append(str);
                        sb.append(" at index ");
                        sb.append(i);
                        dmk.v(woa.r(sb, " of: ", valueOf));
                        return;
                    }
                } else {
                    String valueOf2 = String.valueOf(charSequence);
                    StringBuilder sb2 = new StringBuilder(g.d(String.valueOf(i).length() + 38, 2, str) + valueOf2.length());
                    sb2.append("Invalid percent-encoding at index ");
                    sb2.append(i);
                    sb2.append(" of ");
                    sb2.append(str);
                    dmk.v(woa.r(sb2, ": ", valueOf2));
                    return;
                }
            } else {
                if (bitSet != null && !bitSet.get(charAt)) {
                    StringBuilder sb3 = new StringBuilder(str.length() + 31 + String.valueOf(i).length());
                    sb3.append("Invalid character in ");
                    sb3.append(str);
                    sb3.append(" at index ");
                    sb3.append(i);
                    throw new IllegalArgumentException(sb3.toString());
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) charAt);
                }
            }
            i++;
        }
    }

    private static String zzm(String str) {
        if (str != null && str.indexOf(37) != -1) {
            ByteBuffer allocate = ByteBuffer.allocate(str.length());
            zzl(str, MetricTracker.Object.INPUT, null, allocate);
            allocate.flip();
            try {
                CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                return newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(allocate).toString();
            } catch (CharacterCodingException e) {
                throw new RuntimeException(e);
            }
        }
        return str;
    }

    private static String zzn(String str, BitSet bitSet) {
        if (str == null) {
            return null;
        }
        CharsetEncoder newEncoder = StandardCharsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        try {
            ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str));
            StringBuilder sb = new StringBuilder();
            while (encode.hasRemaining()) {
                byte b = encode.get();
                int i = b & MessagePack.Code.EXT_TIMESTAMP;
                if (bitSet.get(i)) {
                    sb.append((char) i);
                } else {
                    sb.append('%');
                    char[] cArr = zzs;
                    sb.append(cArr[(b & 240) >> 4]);
                    sb.append(cArr[b & 15]);
                }
            }
            return sb.toString();
        } catch (MalformedInputException e) {
            throw new IllegalArgumentException("Malformed input", e);
        } catch (CharacterCodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzccp)) {
            return false;
        }
        zzccp zzccpVar = (zzccp) obj;
        if (!Objects.equals(this.zzl, zzccpVar.zzl) || !Objects.equals(this.zzm, zzccpVar.zzm) || !Objects.equals(this.zzn, zzccpVar.zzn) || !Objects.equals(this.zzo, zzccpVar.zzo) || !Objects.equals(this.zzp, zzccpVar.zzp) || !Objects.equals(this.zzq, zzccpVar.zzq) || !Objects.equals(this.zzr, zzccpVar.zzr)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzl);
        sb.append(':');
        if (zzj()) {
            sb.append("//");
            zzk(sb);
        }
        sb.append(this.zzp);
        String str = this.zzq;
        if (str != null) {
            sb.append('?');
            sb.append(str);
        }
        String str2 = this.zzr;
        if (str2 != null) {
            sb.append('#');
            sb.append(str2);
        }
        return sb.toString();
    }

    public final String zzb() {
        return this.zzl;
    }

    public final String zzc() {
        String str;
        if (zzj()) {
            StringBuilder sb = new StringBuilder();
            zzk(sb);
            str = sb.toString();
        } else {
            str = null;
        }
        return zzm(str);
    }

    public final List zzd() {
        String str = this.zzp;
        dr9 k = jr9.k();
        zzi(str, k);
        return k.g();
    }
}

package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbtu {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b != 34) {
                if (b != 39) {
                    if (b != 92) {
                        switch (b) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (b >= 32 && b <= 126) {
                                    sb.append((char) b);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b >>> 6) & 3) + 48));
                                    sb.append((char) (((b >>> 3) & 7) + 48));
                                    sb.append((char) ((b & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}

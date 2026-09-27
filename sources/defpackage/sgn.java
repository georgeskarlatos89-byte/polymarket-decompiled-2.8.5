package defpackage;

import android.util.Base64;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.MessageReminderInfo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class sgn {
    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final MessageReminderInfo c(MessageReminder messageReminder) {
        messageReminder.getClass();
        return new MessageReminderInfo(messageReminder.getRemindAt(), messageReminder.getCreatedAt(), messageReminder.getUpdatedAt());
    }

    public static String d(inm inmVar) {
        StringBuilder sb = new StringBuilder(inmVar.c());
        for (int i = 0; i < inmVar.c(); i++) {
            byte a = inmVar.a(i);
            if (a != 34) {
                if (a != 39) {
                    if (a != 92) {
                        switch (a) {
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
                                if (a >= 32 && a <= 126) {
                                    sb.append((char) a);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a >>> 6) & 3) + 48));
                                    sb.append((char) (((a >>> 3) & 7) + 48));
                                    sb.append((char) ((a & 7) + 48));
                                    break;
                                }
                                break;
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

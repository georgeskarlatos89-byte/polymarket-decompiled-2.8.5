package io.getstream.chat.android.network.infrastructure;

import android.util.LruCache;
import defpackage.dp8;
import defpackage.q2m;
import defpackage.x3j;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/network/infrastructure/IsoDateAdapter;", "", "Ljava/util/Date;", "value", "", "toJson$stream_chat_android_client_release", "(Ljava/util/Date;)Ljava/lang/String;", "toJson", "fromJson$stream_chat_android_client_release", "(Ljava/lang/String;)Ljava/util/Date;", "fromJson", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IsoDateAdapter {
    public final SimpleDateFormat a;
    public final LruCache b;
    public final Object c;

    public IsoDateAdapter() {
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.a = simpleDateFormat;
        this.b = new LruCache(300);
        this.c = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @dp8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Date fromJson$stream_chat_android_client_release(String value) {
        Date date;
        value.getClass();
        Date date2 = null;
        if (value.length() == 0) {
            return null;
        }
        Date date3 = (Date) this.b.get(value);
        if (date3 != null) {
            return date3;
        }
        try {
            try {
                date = Date.from(q2m.c(value).toInstant());
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            synchronized (this.c) {
                date2 = this.a.parse(value);
                date = date2;
                if (date != null) {
                }
                return date;
            }
        }
        if (date != null) {
            this.b.put(value, date);
        }
        return date;
    }

    @x3j
    public final String toJson$stream_chat_android_client_release(Date value) {
        value.getClass();
        return q2m.a(value.toInstant().atOffset(ZoneOffset.UTC));
    }
}

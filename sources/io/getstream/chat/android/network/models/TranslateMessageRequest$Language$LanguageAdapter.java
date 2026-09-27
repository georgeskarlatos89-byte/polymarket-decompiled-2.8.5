package io.getstream.chat.android.network.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import defpackage.adj;
import defpackage.dp8;
import defpackage.wga;
import defpackage.x3j;
import defpackage.xcj;
import defpackage.ycj;
import defpackage.zcj;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"io/getstream/chat/android/network/models/TranslateMessageRequest$Language$LanguageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ladj;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ladj;", "Lwga;", "writer", "value", "", "toJson", "(Lwga;Ladj;)V", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TranslateMessageRequest$Language$LanguageAdapter extends JsonAdapter<adj> {
    @Override // com.squareup.moshi.JsonAdapter
    @dp8
    public adj fromJson(JsonReader reader) {
        reader.getClass();
        String nextString = reader.nextString();
        if (nextString == null) {
            return null;
        }
        switch (nextString.hashCode()) {
            case 3109:
                if (nextString.equals("af")) {
                    return xcj.b;
                }
                break;
            case 3116:
                if (nextString.equals("am")) {
                    return xcj.c;
                }
                break;
            case 3121:
                if (nextString.equals("ar")) {
                    return xcj.d;
                }
                break;
            case 3129:
                if (nextString.equals("az")) {
                    return xcj.e;
                }
                break;
            case 3141:
                if (nextString.equals("bg")) {
                    return xcj.f;
                }
                break;
            case 3148:
                if (nextString.equals("bn")) {
                    return xcj.g;
                }
                break;
            case 3153:
                if (nextString.equals("bs")) {
                    return xcj.h;
                }
                break;
            case 3184:
                if (nextString.equals("cs")) {
                    return xcj.i;
                }
                break;
            case 3197:
                if (nextString.equals("da")) {
                    return xcj.j;
                }
                break;
            case 3201:
                if (nextString.equals("de")) {
                    return xcj.k;
                }
                break;
            case 3239:
                if (nextString.equals("el")) {
                    return xcj.l;
                }
                break;
            case 3241:
                if (nextString.equals("en")) {
                    return xcj.m;
                }
                break;
            case 3246:
                if (nextString.equals("es")) {
                    return xcj.n;
                }
                break;
            case 3247:
                if (nextString.equals("et")) {
                    return xcj.p;
                }
                break;
            case 3259:
                if (nextString.equals("fa")) {
                    return xcj.q;
                }
                break;
            case 3267:
                if (nextString.equals("fi")) {
                    return xcj.s;
                }
                break;
            case 3276:
                if (nextString.equals("fr")) {
                    return xcj.t;
                }
                break;
            case 3321:
                if (nextString.equals("ha")) {
                    return xcj.v;
                }
                break;
            case 3325:
                if (nextString.equals("he")) {
                    return xcj.w;
                }
                break;
            case 3329:
                if (nextString.equals("hi")) {
                    return xcj.x;
                }
                break;
            case 3338:
                if (nextString.equals("hr")) {
                    return xcj.y;
                }
                break;
            case 3340:
                if (nextString.equals("ht")) {
                    return xcj.z;
                }
                break;
            case 3341:
                if (nextString.equals("hu")) {
                    return xcj.A;
                }
                break;
            case 3355:
                if (nextString.equals(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)) {
                    return xcj.B;
                }
                break;
            case 3371:
                if (nextString.equals("it")) {
                    return xcj.C;
                }
                break;
            case 3383:
                if (nextString.equals("ja")) {
                    return xcj.D;
                }
                break;
            case 3414:
                if (nextString.equals("ka")) {
                    return xcj.E;
                }
                break;
            case 3428:
                if (nextString.equals("ko")) {
                    return ycj.b;
                }
                break;
            case 3464:
                if (nextString.equals("lt")) {
                    return ycj.c;
                }
                break;
            case 3466:
                if (nextString.equals("lv")) {
                    return ycj.d;
                }
                break;
            case 3494:
                if (nextString.equals("ms")) {
                    return ycj.e;
                }
                break;
            case 3518:
                if (nextString.equals("nl")) {
                    return ycj.f;
                }
                break;
            case 3521:
                if (nextString.equals("no")) {
                    return ycj.g;
                }
                break;
            case 3580:
                if (nextString.equals("pl")) {
                    return ycj.h;
                }
                break;
            case 3587:
                if (nextString.equals("ps")) {
                    return ycj.i;
                }
                break;
            case 3588:
                if (nextString.equals("pt")) {
                    return ycj.j;
                }
                break;
            case 3645:
                if (nextString.equals("ro")) {
                    return ycj.k;
                }
                break;
            case 3651:
                if (nextString.equals("ru")) {
                    return ycj.l;
                }
                break;
            case 3672:
                if (nextString.equals("sk")) {
                    return ycj.m;
                }
                break;
            case 3673:
                if (nextString.equals("sl")) {
                    return ycj.n;
                }
                break;
            case 3676:
                if (nextString.equals("so")) {
                    return ycj.o;
                }
                break;
            case 3678:
                if (nextString.equals("sq")) {
                    return ycj.p;
                }
                break;
            case 3679:
                if (nextString.equals("sr")) {
                    return ycj.q;
                }
                break;
            case 3683:
                if (nextString.equals("sv")) {
                    return ycj.r;
                }
                break;
            case 3684:
                if (nextString.equals("sw")) {
                    return ycj.s;
                }
                break;
            case 3693:
                if (nextString.equals("ta")) {
                    return ycj.t;
                }
                break;
            case 3700:
                if (nextString.equals("th")) {
                    return ycj.u;
                }
                break;
            case 3704:
                if (nextString.equals("tl")) {
                    return ycj.v;
                }
                break;
            case 3710:
                if (nextString.equals("tr")) {
                    return ycj.w;
                }
                break;
            case 3734:
                if (nextString.equals("uk")) {
                    return ycj.x;
                }
                break;
            case 3741:
                if (nextString.equals("ur")) {
                    return ycj.y;
                }
                break;
            case 3763:
                if (nextString.equals("vi")) {
                    return ycj.z;
                }
                break;
            case 3886:
                if (nextString.equals("zh")) {
                    return ycj.A;
                }
                break;
            case 96747306:
                if (nextString.equals("es-MX")) {
                    return xcj.o;
                }
                break;
            case 97134199:
                if (nextString.equals("fa-AF")) {
                    return xcj.r;
                }
                break;
            case 97640703:
                if (nextString.equals("fr-CA")) {
                    return xcj.u;
                }
                break;
            case 115813762:
                if (nextString.equals("zh-TW")) {
                    return ycj.B;
                }
                break;
        }
        return new zcj(nextString);
    }

    @x3j
    public void toJson(wga writer, adj value) {
        String str;
        writer.getClass();
        if (value != null) {
            str = value.a;
        } else {
            str = null;
        }
        writer.a0(str);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(wga wgaVar, Object obj) {
        toJson(wgaVar, (adj) obj);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) {
        return fromJson(jsonReader);
    }
}

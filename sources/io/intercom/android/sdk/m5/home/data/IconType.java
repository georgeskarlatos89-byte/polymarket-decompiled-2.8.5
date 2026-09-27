package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/IconType;", "", "<init>", "(Ljava/lang/String;I)V", "TEAMMATE", "BOT", "FIN", "FACE_PILE", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class IconType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ IconType[] $VALUES;

    @SerializedName("teammate")
    public static final IconType TEAMMATE = new IconType("TEAMMATE", 0) { // from class: io.intercom.android.sdk.m5.home.data.IconType.TEAMMATE
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_send_message_icon);
        }
    };

    @SerializedName("bot")
    public static final IconType BOT = new IconType("BOT", 1) { // from class: io.intercom.android.sdk.m5.home.data.IconType.BOT
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_conversation_card_question);
        }
    };

    @SerializedName("fin")
    public static final IconType FIN = new IconType("FIN", 2) { // from class: io.intercom.android.sdk.m5.home.data.IconType.FIN
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_chevron);
        }
    };

    @SerializedName("facepile")
    public static final IconType FACE_PILE = new IconType("FACE_PILE", 3) { // from class: io.intercom.android.sdk.m5.home.data.IconType.FACE_PILE
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return null;
        }
    };

    private static final /* synthetic */ IconType[] $values() {
        return new IconType[]{TEAMMATE, BOT, FIN, FACE_PILE};
    }

    static {
        IconType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    public /* synthetic */ IconType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static IconType valueOf(String str) {
        return (IconType) Enum.valueOf(IconType.class, str);
    }

    public static IconType[] values() {
        return (IconType[]) $VALUES.clone();
    }

    public abstract Integer getIcon();

    private IconType(String str, int i) {
    }
}

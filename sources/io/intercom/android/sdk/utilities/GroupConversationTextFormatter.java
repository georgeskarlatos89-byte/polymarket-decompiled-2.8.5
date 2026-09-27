package io.intercom.android.sdk.utilities;

import android.content.Context;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.sv6;
import io.intercom.android.sdk.R;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/utilities/GroupConversationTextFormatter;", "", "<init>", "()V", "groupConversationTitle", "", "firstName", "", "otherParticipants", "", "context", "Landroid/content/Context;", "groupConversationSubtitle", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GroupConversationTextFormatter {
    public static final int $stable = 0;
    public static final GroupConversationTextFormatter INSTANCE = new GroupConversationTextFormatter();

    private GroupConversationTextFormatter() {
    }

    public static final CharSequence groupConversationSubtitle(String firstName, int otherParticipants, Context context) {
        firstName.getClass();
        context.getClass();
        if (otherParticipants == 1) {
            CharSequence format = Phrase.from(context, R.string.intercom_name_and_1_other).put(Keys.KEY_NAME, firstName).format();
            format.getClass();
            return format;
        }
        if (otherParticipants > 1) {
            CharSequence format2 = Phrase.from(context, R.string.intercom_name_and_x_others).put(Keys.KEY_NAME, firstName).put("count", otherParticipants).format();
            format2.getClass();
            return format2;
        }
        return firstName;
    }

    public static final CharSequence groupConversationTitle(String firstName, int otherParticipants, Context context) {
        firstName.getClass();
        context.getClass();
        if (otherParticipants == 1) {
            StringBuilder s = sv6.s(firstName);
            s.append(context.getString(R.string.intercom_group_conversation_1_other_participant_count_short));
            return s.toString();
        }
        if (otherParticipants > 1) {
            StringBuilder s2 = sv6.s(firstName);
            s2.append((Object) Phrase.from(context, R.string.intercom_group_conversation_multiple_other_participant_count_short).put("other_participant_count", otherParticipants).format());
            return s2.toString();
        }
        return firstName;
    }
}

package io.intercom.android.sdk.m5.push;

import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"getSimplePushDataFromBundle", "Lio/intercom/android/sdk/m5/push/SimplePushData;", "bundle", "Landroid/os/Bundle;", "AppName", "", "AuthorName", "Body", "ContentImageUrl", "ConversationId", "ConversationPartType", "ImageUrl", "InstanceId", "IntercomPushType", "Message", "MessageData", "Receiver", "Title", "Uri", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercomPushDataKt {
    private static final String AppName = "app_name";
    private static final String AuthorName = "author_name";
    private static final String Body = "body";
    private static final String ContentImageUrl = "content_image_url";
    private static final String ConversationId = "conversation_id";
    private static final String ConversationPartType = "conversation_part_type";
    private static final String ImageUrl = "image_url";
    private static final String InstanceId = "instance_id";
    private static final String IntercomPushType = "intercom_push_type";
    private static final String Message = "message";
    private static final String MessageData = "message_data";
    private static final String Receiver = "receiver";
    private static final String Title = "title";
    private static final String Uri = "uri";

    public static final /* synthetic */ SimplePushData access$getSimplePushDataFromBundle(Bundle bundle) {
        return getSimplePushDataFromBundle(bundle);
    }

    private static final SimplePushData getSimplePushDataFromBundle(Bundle bundle) {
        String string = bundle.getString(IntercomPushType, "");
        string.getClass();
        String string2 = bundle.getString("conversation_id", "");
        string2.getClass();
        String string3 = bundle.getString("title", "");
        string3.getClass();
        String string4 = bundle.getString("message", "");
        string4.getClass();
        String string5 = bundle.getString(Receiver, "");
        string5.getClass();
        String string6 = bundle.getString(AuthorName, "");
        string6.getClass();
        String string7 = bundle.getString(Body, "");
        string7.getClass();
        String string8 = bundle.getString(AppName, "");
        string8.getClass();
        String string9 = bundle.getString(ContentImageUrl, "");
        string9.getClass();
        String string10 = bundle.getString(ImageUrl, "");
        string10.getClass();
        String string11 = bundle.getString(Uri, "");
        string11.getClass();
        String string12 = bundle.getString(InstanceId, "");
        string12.getClass();
        String string13 = bundle.getString(ConversationPartType, "");
        string13.getClass();
        String string14 = bundle.getString(MessageData, "");
        string14.getClass();
        return new SimplePushData(string, string2, string3, string4, string7, string5, string6, string8, string9, string10, string11, string12, string13, string14);
    }
}

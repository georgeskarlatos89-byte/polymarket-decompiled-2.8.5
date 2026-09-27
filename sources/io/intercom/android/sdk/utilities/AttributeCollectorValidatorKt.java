package io.intercom.android.sdk.utilities;

import android.content.res.Resources;
import io.intercom.android.sdk.R;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"getErrorStringFromCode", "", "Landroid/content/res/Resources;", "errorCode", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AttributeCollectorValidatorKt {
    public static final String getErrorStringFromCode(Resources resources, int i) {
        resources.getClass();
        switch (i) {
            case 1:
                String string = resources.getString(R.string.intercom_string_is_incorrect);
                string.getClass();
                return string;
            case 2:
                String string2 = resources.getString(R.string.intercom_that_email_address_doesnt_look_quite_right);
                string2.getClass();
                return string2;
            case 3:
                String string3 = resources.getString(R.string.intercom_that_number_doesnt_look_quite_right);
                string3.getClass();
                return string3;
            case 4:
                String string4 = resources.getString(R.string.intercom_that_number_needs_a_prefix);
                string4.getClass();
                return string4;
            case 5:
                String string5 = resources.getString(R.string.intercom_that_number_has_too_many_digits);
                string5.getClass();
                return string5;
            case 6:
                String string6 = resources.getString(R.string.intercom_that_country_code_doesnt_look_quite_right);
                string6.getClass();
                return string6;
            case 7:
                String string7 = resources.getString(R.string.intercom_that_number_is_missing_a_few_digits);
                string7.getClass();
                return string7;
            default:
                return "";
        }
    }
}

package io.intercom.android.sdk.utilities;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class AttributeSanitiser {
    private static final String EMAIL = "email";
    private static final String USER_ID = "user_id";
    private static final Twig twig = LumberMill.getLogger();

    public static void anonymousSanitisation(Map<String, ?> map) {
        if (map.containsKey("email")) {
            twig.e(String.format("You cannot update the email of an anonymous user. Please call registerIdentified user instead. The email: %s was NOT applied", map.remove("email")), new Object[0]);
        }
        if (map.containsKey(USER_ID)) {
            twig.e(String.format("You cannot update the user_id of an anonymous user. Please call registerIdentified user instead. The user_id: %s was NOT applied", map.remove(USER_ID)), new Object[0]);
        }
    }
}

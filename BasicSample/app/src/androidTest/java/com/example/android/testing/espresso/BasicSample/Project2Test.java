package com.example.android.testing.espresso.BasicSample;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Project2Test {
    @Rule
    public ActivityScenarioRule<MainActivity> rule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testChangeTextEmpty() {
        onView(withId(R.id.editTextUserInput))
                .perform(typeText(""), closeSoftKeyboard());

        onView(withId(R.id.changeTextBt))
                .perform(click());

        onView(withId(R.id.textToBeChanged))
                .check(matches(withText("")));
    }

    // Test 5: Empty input + Open Activity
    @Test
    public void testOpenActivityEmpty() {
        onView(withId(R.id.editTextUserInput))
                .perform(typeText(""), closeSoftKeyboard());

        onView(withId(R.id.activityChangeTextBtn))
                .perform(click());

        onView(withId(R.id.show_text_view))
                .check(matches(withText("")));
    }

    @Test
    public void testChangeText123() {
        onView(withId(R.id.editTextUserInput))
                .perform(typeText("123"), closeSoftKeyboard());
        onView(withId(R.id.changeTextBt))
                .perform(click());
        onView(withId(R.id.textToBeChanged))
                .check(matches(withText("123")));
    }

    @Test
    public void testOpenActivity123() {
        onView(withId(R.id.editTextUserInput))
                .perform(typeText("123"), closeSoftKeyboard());
        onView(withId(R.id.activityChangeTextBtn))
                .perform(click());
        onView(withId(R.id.show_text_view))
                .check(matches(withText("123")));
    }

    @Test
    public void testChangeTextAbcdef() {
        onView(withId(R.id.editTextUserInput))
                .perform(typeText("abcdef"), closeSoftKeyboard());

        onView(withId(R.id.changeTextBt))
                .perform(click());

        onView(withId(R.id.textToBeChanged))
                .check(matches(withText("abcdef")));
    }

    @Test
    public void testOpenActivityAbcdef() {
        onView(withId(R.id.editTextUserInput))
                .perform(typeText("abcdef"), closeSoftKeyboard());

        onView(withId(R.id.activityChangeTextBtn))
                .perform(click());

        onView(withId(R.id.show_text_view))
                .check(matches(withText("abcdef")));
    }
}

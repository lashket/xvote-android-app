package org.xmart.elections.base

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation

open class BaseFragment(
    @LayoutRes layoutResId: Int
): Fragment(layoutResId) {


    fun navigateTo(id: Int) {
        Navigation.findNavController(requireView()).navigate(id)
    }

    fun navigateTo(action: NavDirections) {
        Navigation.findNavController(requireView()).navigate(action)
    }

}
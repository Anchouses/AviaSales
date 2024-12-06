package com.silaeva.common_ui.bottom_nav_bar

import android.os.Bundle
import android.view.View
import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
//import androidx.navigation.findNavController
//import kotlinx.coroutines.launch
//import org.koin.androidx.viewmodel.ext.android.viewModel
//
//class BottomNavBarFragment : ComposableFragment() {
//
//    companion object {
//        fun newInstance() = BottomNavBarFragment()
//    }
//
//    private val searchEventViewModel: SearchEventViewModel by viewModel<SearchEventViewModel>()
//    private val chatListViewModel: ChatListViewModel by viewModel<ChatListViewModel>()
//    private val profileViewModel: ProfileViewModel by viewModel<ProfileViewModel>()
//
//    @Composable
//    override fun SetContent() {
//        BottomNavBar()
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        viewLifecycleOwner.lifecycleScope.launch {
//            repeatOnLifecycle(Lifecycle.State.STARTED) {
//                searchEventViewModel.navigation.collect {
//                    when (it) {
//                        com.silaeva.common_ui.bottom_nav_bar.BottomBarDirection.FILTERS -> view.findNavController()
//                            .navigate(
//                                R.id.action_bottomNavBarFragment_to_filtersFragment
//                            )
//                        com.silaeva.common_ui.bottom_nav_bar.BottomBarDirection.CONFIRMATION -> view.findNavController()
//                            .navigate(
//                                R.id.action_bottomNavBarFragment_to_confirmationPersonFragment
//                            )
//                        com.silaeva.common_ui.bottom_nav_bar.BottomBarDirection.CREATE_EVENT -> view.findNavController()
//                            .navigate(
//                                R.id.action_bottomNavBarFragment_to_createEventFragment
//                            )
//                        else -> {}
//                    }
//                }
//            }
//        }
//        viewLifecycleOwner.lifecycleScope.launch {
//            repeatOnLifecycle(Lifecycle.State.STARTED) {
//                profileViewModel.navigation.collect {
//                    when (it) {
//                        com.silaeva.common_ui.bottom_nav_bar.BottomBarDirection.FRIENDS -> view.findNavController()
//                            .navigate(
//                                R.id.action_bottomNavBarFragment_to_friendsFragment
//                            )
//
//                        else -> {}
//                    }
//                }
//            }
//        }
//    }
//}
package com.bor.biencuta.photo.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.bor.biencuta.databinding.FragmentPhotoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PhotoFragment : Fragment() {

    private lateinit var binding: FragmentPhotoBinding

    private val viewModel: PhotoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPhotoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUi()
    }

    private fun setupUi() = with(binding) {

        backButton.setOnClickListener {
            findNavController().popBackStack()
        }


        val viewPager: ViewPager2 = slider
        val adapter = PhotoAdapter()

        //FIXME: FIX URL FETCHING AND DISPLAYING IMAGES USING LIVE DATA AND PHOTO ADAPTER
        viewModel.getImagesUrls().observeForever {
            adapter.setUrlsList(it)
        }

        viewPager.adapter = adapter
    }
}